#!/bin/sh
##############################################################################
##          ##          ##    ########          ##          ##    ############
##          ##          ##    ########          ##          ##    ############
######    #####    ########    ########    ########    ########    ###########
######    #####    ########    ########    ########    ########    ###########
#######    #####       #####    ########    ########       #####    ##########
#######    #####       #####    ########    ########       #####    ##########
########    #####    ########    ########    ########    ########    #########
########    #####    ########    ########    ########    ########    #########
#########    #####          ##          ##          ##          ##          ##
#########    #####          ##          ##          ##          ##          ##
##############################################################################
#               Copyright 2019 Radio Movil DIPSA S.A. DE C.V.                #
##############################################################################
#                          INFORMACION DEL PROGRAMA                          #
# NOMBRE: modificarInsumos                                                   #
# AUTOR : Guerro Martínez José Eduardo                                       #
##############################################################################
# PROPOSITO: Proceso que realiza el envio via FTP a M2K de archivos POSTING  #
# FUNCIONES PRINCIPALES:                                                     #
# Validar que la ruta del INPUT exista y tenga archivos                      #
# Validar que el parametro de ruta M2K sea informado y sea correcto          #
# Enviar via FTP todos los archivos posting que se encuentren en el INPUT    #
##############################################################################
# USO: Local Windows                                                         #
##############################################################################
# PARAMETROS:                                                                #
# m                                                                          #
##############################################################################
# Archivos utilizados:                                                       #
# ModificacionDeInsumos.cfg                                                  #
# ModificacionDeInsumos.lock                                                 #
# modificacionInsumosLog.log                                                 #
##############################################################################
##############################################################################
#                         REGISTRO DE MODIFICACIONES                         #
# FOLIO   FECHA     AUTOR                            DESCRIPCION             #
# 360429  28/NV/19  Guerrero Martinez José Eduardo  Version Para Linux       #
##############################################################################
#                          DESCRIPCION DE VARIABLES                          #
# FECHA_DIA:     Fecha del dia que se le colocara al LOG                     #
# C_EXISTE:      Variable utilizada como indicador                           #
#                                                                            #
#                                                                            #
##############################################################################
##############################################################################
# Procedimiento: P10000_INICIO                                               #
# Objetivo: Parrafo que carga, valida e inicializa el ambiente               #
############################################################################## 
P10000_INICIO(){
  P12000_PRE_INICIO
  P13000_ARCHIVO_CTL
  P14000_EJECUTAR_JAR
  P15001_PERMISOS_1
  P15002_PERMISOS_2
  P15003_PERMISOS_3
  P15004_PERMISOS_4
  P15005_PERMISOS_5
  P15006_PERMISOS_6
  P15007_PERMISOS_7
  P15008_PERMISOS_8  
  P15000_RENOMBRAR_LOG

}
##############################################################################
# Procedimiento: P13000_ARCHIVO_CTL                                          #
# Objetivo: Funcion que valida el archivo de control                         #
##############################################################################
P13000_ARCHIVO_CTL(){
# Validacion si existe el archivo lock
  test -f ${CFG_DIR_CTL}"/ModificacionDeInsumos.lock"
  export C_EXISTE=`echo -e $?`
  if [ ${C_EXISTE} != "0" ] ; then
# Si no existe lo crea
    touch ${CFG_DIR_CTL}"/ModificacionDeInsumos.lock"
    if [ $? = 0 ] ; then
      echo  Se crea el archivo de control
    else
# Si no lo puede crear manda mensaje de error
      echo  El archivo de control no se pudo crear, se termina la ejecucion
        
      exit 0
    fi
  else
# Si existe manda mensaje de error y termina la ejecucion
    echo  Ya existe el archivo de Control, se termina la ejecucion
      
    exit 0
  fi
}
########################################################################################
# Procedimiento: P14000_EJECUTAR_JAR                                                   #
# Objetivo: EJECUTAR PROGRMA PRINCIPAL  ModificacionDeInsumos.JAR Y DAR PERMISOS A done#
########################################################################################
P14000_EJECUTAR_JAR(){
  java -jar /u01/Telcel/CODE/Automa_Preta/L_modificacionInsumos1.0.jar
  chmod 777 /u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/done -Rf
}

##############################################################################
# Procedimiento: P15001_PERMISOS_1                                           #
# Objetivo: PONER NOMBRE VALIDO PARA PROCESOS DE TASADO                      #
##############################################################################
P15001_PERMISOS_1(){
  FECHA_DIA=$(date '+%Y%m%d%H%M%S')
  mv /u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/done/MOBILE/CUB.TTFILE00 '/u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/done/MOBILE/A2L.TTFILE00.006379.'${FECHA_DIA} &>/dev/null
}
##############################################################################
# Procedimiento: P15002_PERMISOS_2                                           #
# Objetivo: PONER NOMBRE VALIDO PARA PROCESOS DE TASADO                      #
##############################################################################
P15002_PERMISOS_2(){
  FECHA_DIA=$(date '+%Y%m%d%H%M%S')  
  mv /u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/done/GPRS/GPRS92.NOK-1.TTFILE00 '/u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/done/GPRS/GPRSAC.TTFILE00.006379.'${FECHA_DIA} &>/dev/null
}

##############################################################################
# Procedimiento: P15003_PERMISOS_3                                           #
# Objetivo: PONER NOMBRE VALIDO PARA PROCESOS DE TASADO                      #
##############################################################################
P15003_PERMISOS_3(){
  FECHA_DIA=$(date '+%Y%m%d%H%M%S')
  mv /u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/done/GPRSO/MEXTLUSACGRAIN '/u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/done/GPRSO/MEXTLABWSERAIN006379.'${FECHA_DIA} &>/dev/null
}
##############################################################################
# Procedimiento: P15004_PERMISOS_4                                           #
# Objetivo: PONER NOMBRE VALIDO PARA PROCESOS DE TASADO                      #
##############################################################################
P15004_PERMISOS_4(){
  FECHA_DIA=$(date '+%Y%m%d%H%M%S')
  mv /u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/done/GPRSOM/MEXCSCHGMGRAIN '/u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/done/GPRSOM/MEXCMCHGMGRAIN006379.grps.'${FECHA_DIA} &>/dev/null 
}
##############################################################################
# Procedimiento: P15005_PERMISOS_5                                           #
# Objetivo: PONER NOMBRE VALIDO PARA PROCESOS DE TASADO                      #
##############################################################################
P15005_PERMISOS_5(){
  FECHA_DIA=$(date '+%Y%m%d%H%M%S')
  mv /u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/done/MMS/MMS-COM-1.TTFILE00 '/u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/done/MMS/MMS-COM-1.TTFILE00.006379.'${FECHA_DIA} &>/dev/null
}
##############################################################################
# Procedimiento: P15006_PERMISOS_6                                           #
# Objetivo: PONER NOMBRE VALIDO PARA PROCESOS DE TASADO                      #
##############################################################################
P15006_PERMISOS_6(){
  FECHA_DIA=$(date '+%Y%m%d%H%M%S')
  mv /u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/done/OROAM_ENTRANTE/MEXTLISRPLRAINVS '/u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/done/OROAM_ENTRANTE/MO.MEXTLABWSERAIN006379.'${FECHA_DIA} &>/dev/null
}

##############################################################################
# Procedimiento: P15007_PERMISOS_7                                           #
# Objetivo: PONER NOMBRE VALIDO PARA PROCESOS DE TASADO                      #
##############################################################################
P15007_PERMISOS_7(){
  FECHA_DIA=$(date '+%Y%m%d%H%M%S')
  mv /u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/done/OROAM_SALIENTE/MEXTLISRPLRAINVS '/u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/done/OROAM_SALIENTE/MO.MEXTLABWSERAIN006379.'${FECHA_DIA} &>/dev/null
}
##############################################################################
# Procedimiento: P15008_PERMISOS_8                                           #
# Objetivo: PONER NOMBRE VALIDO PARA PROCESOS DE TASADO                      #
##############################################################################
P15008_PERMISOS_8(){
  FECHA_DIA=$(date '+%Y%m%d%H%M%S')
  mv /u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/done/GPRSCM/GPRST1.CS.TTFILE00 '/u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/done/GPRSCM/GPRSCM.TTFILE00.006379.'${FECHA_DIA} &>/dev/null
}
##############################################################################
# Procedimiento: P12000_PRE_INICIO                                           #
# Objetivo: VALIDAR O CREAR RUTAS DE TRABAJO                                 #
##############################################################################
P12000_PRE_INICIO(){
mkdir /u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos &>/dev/null
mkdir /u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/done &>/dev/null
mkdir /u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/input &>/dev/null
mkdir /u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/done/MOBILE &>/dev/null
mkdir /u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/done/GPRS &>/dev/null
mkdir /u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/done/GPRSCM &>/dev/null
mkdir /u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/done/GPRSO &>/dev/null
mkdir /u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/done/GPRSOM &>/dev/null
mkdir /u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/done/MMS &>/dev/null
mkdir /u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/done/OROAM_ENTRANTE &>/dev/null
mkdir /u01/Telcel/DATA/Automa_Preta/Modificacion_Insumos/done/OROAM_SALIENTE &>/dev/null
clear
if [ -f /u01/Telcel/CFG_CTL/Config/modificarInsumos.cfg ] ; then
  . /u01/Telcel/CFG_CTL/Config/modificarInsumos.cfg  
else
    
  echo  No se encuentra el archivo de configuracion modificarInsumos.cfg
    
  exit 0
fi 
}
##############################################################################
# Procedimiento: P15000_RENOMBRAR_LOG                                        #
# Objetivo: RENOMBRAR LOG                                                    #
##############################################################################
P15000_RENOMBRAR_LOG(){
  FECHA_DIA=$(date '+%Y-%m-%d_%H:%M:%S')
  mv /u01/Telcel/LOG/Automa_Preta/Update_date/log.txt '/u01/Telcel/LOG/Automa_Preta/Update_date/modificacionInsumosLog_'${FECHA_DIA}'.log'
}
##############################################################################
# Procedimiento: P30000_FIN                                                  #
# Objetivo: Funcion encargado de terminar el proceso del Shell               #
##############################################################################
P30000_FIN(){
  _BORRA_CTL
  echo Termina Proceso
}
##############################################################################
# Procedimiento: _BORRA_CTL                                                  #
# Objetivo: Funcion encargado de borrar el archivo .lock                     #
##############################################################################
_BORRA_CTL(){
  rm -f ${CFG_DIR_CTL}"/ModificacionDeInsumos.lock"
  echo  Archivo de control borrado
}
#INICIA PROCESO

P10000_INICIO
P30000_FIN
