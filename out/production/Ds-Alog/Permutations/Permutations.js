var printPermutations = function (str, perm) {
    if (str.length == 0) {
        console.log(perm);
        return;
    }
    for (var i = 0; i < str.length; i++) {
        var currChar = str.charAt(i);
        var newStr = str.substring(0, i) + str.substring(i + 1);
        printPermutations(newStr, perm.concat(currChar));
    }
};
printPermutations("ABC", "");
