const printPermutations = (str: string, perm: string) => {
  if(str.length == 0){
      console.log(perm);
      return
  }

  for(let i = 0 ; i<str.length ; i++){
      let currChar : string = str.charAt(i);
      let newStr  : string = str.substring(0,i) + str.substring(i+1);
      printPermutations(newStr, perm.concat(currChar));
  }

};

printPermutations("ABC", "");
