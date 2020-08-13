//https://www.codewars.com/kata/554e4a2f232cdd87d9000038

function DNAStrand(dna){
    const map = {
        'A' : 'T',
        'C' : 'G',
        'T' : 'A',
        'G' : 'C'
    }

    return [...dna].map((a) => map[a]).join('')
}
