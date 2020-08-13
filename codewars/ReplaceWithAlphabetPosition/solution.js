// https://www.codewars.com/kata/546f922b54af40e1e90001da/

function alphabetPosition(text) {
  text = text.toLowerCase()
  let all = ""
  text.split('').forEach(element => {
      if(element.match(/[a-zA-Z]/))
          all += `${element.charCodeAt(0)-96} `
  });

  return all.slice(0, -1);
}
