const isGoodWeather = true;
const promise = new Promise(function (resolve) {
    if (isGoodWeather) {
        resolve("You should go to the beach!");
    }
});

const successText = promise.then(function successStatus(response) {
    console.log(response);
    return response;
});