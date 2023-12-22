<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Update page</title>
        <style>
            body {
                background-color: #f4f4f4;
                font-family: Arial, sans-serif;
                text-align: center;
                padding: 20px;
            }

            h1 {
                color: #333;
                margin-bottom: 20px;
            }

            form {
                background-color: #fff;
                padding: 20px;
                border-radius: 8px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                display: inline-block;
            }

            input {
                width: 100%;
                padding: 10px;
                margin-bottom: 10px;
                box-sizing: border-box;
            }

            button {
                background-color: #007bff;
                color: #fff;
                padding: 10px 20px;
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
        <h1>--------Update Laptop Record Here----------</h1>

        <form action="/updateLaptopData" method="post">
            Enter the Laptop Id: <input type="text" name="id"><br><br>
            Enter the Laptop Brand: <input type="text" name="brand"><br><br>
            Enter the Laptop Price: <input type="text" name="price"><br><br>
            <button>Submit</button>
        </form>
    </body>

    </html>