from flask import Flask, render_template
import requests

app = Flask(__name__)

# URL de la API
API_URL = "http://localhost:8080/api/recursos"

# Mapeo de colores
COLOR_MAP = {
    "Verde": "#28a745",   # Verde Bootstrap
    "Rojo": "#dc3545",    # Rojo Bootstrap
    "Amarillo": "#ffc107" # Amarillo Bootstrap
}

def get_data():
    try:
        response = requests.get(API_URL, timeout=5)  # Agregar un timeout
        response.raise_for_status()  # Manejo de errores HTTP
        if response.status_code == 200:
            data = response.json()
            
            # Convertimos los nombres de colores en códigos hexadecimales
            for item in data:
                item["cpuUsColor"] = COLOR_MAP.get(item["cpuUsColor"], "#000000")  # Negro por defecto
                item["ramUsedKbColor"] = COLOR_MAP.get(item["ramUsedKbColor"], "#000000")
                item["swapUsedKbColor"] = COLOR_MAP.get(item["swapUsedKbColor"], "#000000")
                item["ramTotalKbColor"] = COLOR_MAP.get(item["ramTotalKbColor"], "#000000")
                item["tasksTotalColor"] = COLOR_MAP.get(item["tasksTotalColor"], "#000000")
                item["upDaysColor"] = COLOR_MAP.get(item["upDaysColor"], "#000000")
            
            return data
    except requests.exceptions.RequestException as e:
        print(f"Error al obtener datos: {e}")
        return []

@app.route('/')
def index():
    data = get_data()

    print("---------------",data)
    return render_template('index.html', data=data)


if __name__ == '__main__':
    app.run(debug=True)

# Crear la plantilla index.html
html_template = """
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Monitoreo de Servidores</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
    <style>
        /* Estilos personalizados */
        body {
            background-color: #f8f9fa; /* Fondo claro */
        }

        .table-container {
            background: white;
            border-radius: 10px;
            padding: 20px;
            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1);
            margin-top: 30px;
        }

        table {
            border-radius: 8px;
            overflow: hidden;
        }

        th {
            background-color: #343a40 !important; /* Encabezado oscuro */
            color: white !important;
            text-align: center;
        }

        td {
            text-align: center;
            vertical-align: middle;
        }

        .color-box {
            width: 20px;
            height: 20px;
            display: inline-block;
            border-radius: 5px;
            border: 1px solid #ddd;
        }

        tbody tr:nth-child(odd) {
            background-color: #f2f2f2; /* Alternancia de colores */
        }

        tbody tr:hover {
            background-color: #d1ecf1 !important; /* Efecto hover */
        }
    </style>
</head>
<body>

    <div class="container table-container">
        <h2 class="text-center mb-4">📊 Monitoreo de Servidores</h2>
        <table class="table table-bordered table-hover">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>CPU Uso (%)</th>
                    <th>Color</th>
                    <th>RAM Usada (KB)</th>
                    <th>Color</th>
                    <th>Swap Usado (KB)</th>
                    <th>Color</th>
                    <th>RAM Total (KB)</th>
                    <th>Color</th>
                    <th>Total Tareas</th>
                    <th>Color</th>
                    <th>Días en línea</th>
                    <th>Color</th>
                </tr>
            </thead>
            <tbody>
                {% for item in data %}
                <tr>
                    <td>{{ item.id }}</td>
                    <td>{{ item.cpuUs }}</td>
                    <td><span class="color-box" style="background-color: {{ item.cpuUsColor }}"></span></td>
                    
                    <td>{{ item.ramUsedKb }}</td>
                    <td><span class="color-box" style="background-color: {{ item.ramUsedKbColor }}"></span></td>
                    
                    <td>{{ item.swapUsedKb }}</td>
                    <td><span class="color-box" style="background-color: {{ item.swapUsedKbColor }}"></span></td>
                    
                    <td>{{ item.ramTotalKb }}</td>
                    <td><span class="color-box" style="background-color: {{ item.ramTotalKbColor }}"></span></td>
                    
                    <td>{{ item.tasksTotal }}</td>
                    <td><span class="color-box" style="background-color: {{ item.tasksTotalColor }}"></span></td>
                    
                    <td>{{ item.upDays }}</td>
                    <td><span class="color-box" style="background-color: {{ item.upDaysColor }}"></span></td>
                </tr>
                {% endfor %}
            </tbody>
        </table>
    </div>

</body>
</html>
"""

# Guardar el archivo HTML
import os
os.makedirs('templates', exist_ok=True)
with open('templates/index.html', 'w', encoding='utf-8') as f:
    f.write(html_template)
