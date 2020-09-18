function min(data) {
    let min;
    min = data[0];
    for(let i = 0; i <= data.length; i++) {
        if(min > data[i]) {
            min = data[i];
        }
    }
    return min;
}

data = [100, 30, 50, 40];

console.log(data);
console.log(min(data));
