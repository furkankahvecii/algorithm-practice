// https://www.codewars.com/kata/517abf86da9663f1d2000003

function toCamelCase(str){
    return str.replace(/-/g,' ').replace(/_/g,' ').split(' ').map((val,index) => index == 0 ? val  : val.charAt(0).toUpperCase() + val.slice(1)).join("")
}
