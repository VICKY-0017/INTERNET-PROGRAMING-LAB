<?php
function factorial($n) {
    if ($n === 0) {
        return 1;
    } else {
        return $n * factorial($n - 1);
    }
}

$number = 5; // Change this to any number you want to find the factorial of
echo "The factorial of $number is: " . factorial($number);
?>