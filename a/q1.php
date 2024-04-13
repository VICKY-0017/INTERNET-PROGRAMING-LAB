<!DOCTYPE html>
<html>
<head>
    <title>Temperature Converter</title>
</head>
<body>
    <h2>Temperature Converter</h2>
    <form method="post">
        <label for="temperature">Enter temperature:</label>
        <input type="text" id="temperature" name="temperature" required>+
        <select name="unit" id="unit" required>
            <option value="celsius">Celsius</option>
            <option value="fahrenheit">Fahrenheit</option>
        </select>
        <input type="submit" value="Convert">
    </form>
    
    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $temperature = $_POST["temperature"];
        $unit = $_POST["unit"];
        if ($unit == "celsius") {
            $fahrenheit = ($temperature * 9/5) + 32;
            echo "<p>$temperature &deg;C is $fahrenheit &deg;F</p>";
        } elseif ($unit == "fahrenheit") {
            $celsius = ($temperature - 32) * 5/9;
            echo "<p>$temperature &deg;F is $celsius &deg;C</p>";
        }
    }
    ?>
</body>
</html>
