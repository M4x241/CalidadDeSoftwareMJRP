<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="/personas" method="post">
        @csrf
        <label for="nombre">Nombre</label>
        <input type="text" name="nombre" id="nombre" placeholder="nombre">

        <br>
        <label for="apellidos">Apellido</label>
        <input type="text" name="apellidos" id="apellidos" placeholder="apellidos">

        <br>
        <label for="correo">Correo</label>
        <input type="text" name="correo" id="correo" placeholder="correo">
        <br>
        <label for="sexo">Sexo</label>
        <select name="sexo" id="sexo">
            <option value="hombre">Hombre</option>
            <option value="mujer">Mujer</option>
        </select>
        <br>
        <button type="submit">Login</button>
    </form>

</body>
</html>
