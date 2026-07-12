/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    const newarr =[]
    for(i=0; i<arr.length; i++){
        newarr[i] = fn(arr[i], i)
    }
    return newarr
};