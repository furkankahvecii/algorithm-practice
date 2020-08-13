// https://www.codewars.com/kata/5667e8f4e3f572a8f2000039

function accum(str) {
	    return [...str].map((letter,index) => {        
        return (letter.toUpperCase() + letter.toLowerCase().repeat(index))
    }).join('-')
}
