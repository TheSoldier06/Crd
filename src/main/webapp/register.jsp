<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Registration page</title>
        <style>
            body {
                background-color: #f0f0f0;
                font-family: Arial, sans-serif;
                display: flex;
                align-items: center;
                justify-content: center;
                height: 100vh;
                margin: 0;
            }

            form {
                background-color: #fff;
                padding: 20px;
                border-radius: 8px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            }

            input {
                width: 100%;
                padding: 10px;
                margin-bottom: 10px;
            }

            button {
                background-color: #007bff;
                color: #fff;
                padding: 10px;
                border: none;
                border-radius: 4px;
                cursor: pointer;
            }

            button:hover {
                background-color: #0056b3;
            }
        </style>
    </head>

    <body>
        <form action="/saveLaptopData" method="post">
            Enter the Laptop Id: <input type="text" name="id"><br><br>
            Enter the Laptop brand: <input type="text" name="brand"><br><br>
            Enter the Laptop price: <input type="text" name="price"><br><br>
            <button>Submit</button>
        </form>
    </body>

    </html>