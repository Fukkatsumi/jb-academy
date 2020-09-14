function sum(numbers) {
    let sum = 0;

    for (n in numbers) {
        if (numbers[n] == 0) {
            return sum;
        }

        sum += numbers[n];
    }
}