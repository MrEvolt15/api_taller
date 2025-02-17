Sistema de Monitoreo de Servidores 🚀
Este proyecto implementa un sistema de monitoreo de servidores con Spring Boot para la API y Flask para la visualización web.

📌 Requisitos Previos
Antes de comenzar, asegúrate de tener instalado:

Java 17+
Maven
Python 3.8+
PostgreSQL (base de datos en línea ya configurada)
🔧 Instalación y Ejecución
1️⃣ Clonar el Repositorio
  git clone https://github.com/MrEvolt15/api_taller.git
  cd api_taller
2️⃣ Iniciar la API con Maven
Ejecuta el siguiente comando para compilar y ejecutar el servidor:
  mvn spring-boot:run
La API estará disponible en:
👉 http://localhost:8080/api/recursos
3️⃣ Ejecutar la Interfaz Web con Flask
Desde otro terminal, asegúrate de tener Flask instalado:
  pip install flask requests
Luego, ejecuta el script test.py:
  python test.py
La interfaz web estará disponible en:
👉 http://127.0.0.1:5000/

📌 Flujo del Sistema
1️⃣ Spring Boot obtiene los datos desde PostgreSQL y los expone a través de la API.
2️⃣ Flask consume los datos desde la API y los muestra en una interfaz web.
