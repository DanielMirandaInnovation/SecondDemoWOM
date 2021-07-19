Segunda POC WOM
El robot será ejecutado por el equipo de Monitoreo de WOM de acuerdo a la frecuencia definida. El alcance del robot es el siguiente
1.	Ingresar a la aplicación AVANTEL
2.	Consultar en el Excel el ID del cliente
3.	Seleccionar motivo de rechazo de acuerdo a información en el Excel
4.	Capturar y almacenar pantalla de rechazo
5.	Ejecutar acción de rechazo sobre el registro
6.	Garantizar transición de estados exitosa
7.	Notificar finalización exitosa del proceso


Para la instalación del robot es necesario:
Instalación y configuración de Java
1.	Descargar el JDK de java versión 1.8 de la siguiente url: https://www.oracle.com/co/java/technologies/javase/javase-jdk8-downloads.html
2.	Instalar el JDK descargado. 
3.	Configurar JAVA_HOME como variable de entorno, para ello se busca la ruta del jdk descargado, una vez encontrada la ruta esta es el valor del JAVA_HOME.
4.	De clic en la opción Path y entre hasta el bin del JAVA_HOME de la siguiente manera: %JAVA_HOME%\bin

Instalación y configuración del robot
1.	Tener accesos y permisos de VPN configurados (Si aplica).
2.	Crear una carpeta en el disco local C llamada RPASQA 
3.	Dentro de la carpeta de RPASQA debe pegar los siguientes archivos:
  -	El driver actualizado a la versión del navegador correspondiente
  -	El archivo de Excel suministrado por el cliente
  -	Archivo de conf.properties suministrado por SQA
  -	Jar de ejecución. 
Adicionalmente crear una carpeta llamada “Evidences”
4.	Abra el archivo conf.properties y configure las credenciales o datos como desee. El archivo conf.properties tiene lo siguientes campos.
•	Los campos “user” y “password” son las credenciales de acceso a la aplicación de Avantel. 
•	El campo “filepath” es la ruta donde estará almacenado el Excel proporcionado por el cliente. 
•	El campo “sheetName” es la hoja del archivo de Excel que contiene los datos a usar en el proceso. 
•	El campo “userForEmail” y “passwordForEmail” son las credenciales del correo emisor. 
•	El campo “destinationMail” es el receptor de la notificación enviada por el robot.
•	El campo “subject” es el asunto que se quiera personalizar para la notificación. 
•	El campo “url” es la url de la aplicación de Avantel. 

Ejecución del robot y evidencias

1.	En la carpeta “Evidences” se almacenará el screenshot con la información del motivo de rechazo por su respectivo id, hora y fecha en que fue tomado el screenshot.
2.	Asegurar que en la raíz de la carpeta RPASQA ubicada en el disco local C, se encuentre el jar de ejecución “KrakenSqa.jar”. Si no es así clone el proyecto y
desde eclipse exporte el proyecto como un .jar
3.	Abrir un bloc de notas y escribir la siguiente línea: java -jar "nombreArchivo.jar". El nombre del archivo debe coincidir con el jar almacenado en la carpeta RPASQA. 
Por ejemplo, si el nombre del archivo se conserva como lo entrega SQA, la línea debe ser “java -jar KrakenSqa.jar”. Guardar el bloc de notas de la siguiente manera 
dentro de la carpeta RPASQA : "NombreArchivo.bat" incluyendo las comillas.
4.	Crear un acceso directo al archivo.bat, basta con dar clic derecho en el archivo y “Crear acceso directo”. 
5.	Modificar nombre del acceso directo y personalizar ícono suministrado por SQA. Basta con dar clic derecho “Cambiar nombre” por “krakenSQA”.  Para personalizar el icono se da clic derecho / Propiedades / Cambiar icono 
y selecciona el icono que desee agregar. 
6.	Para ejecutar el robot, debe dar doble clic sobre el icono. 




