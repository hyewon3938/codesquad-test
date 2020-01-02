
//합을 구하는 내부 함수 (sum)
function sum(byteA,byteB){
    if(byteA===byteB){
        return false;
    }else{
        return true;
    }
}

//자리올림 비트를 구하는 내부 함수 (carry)
function carry(byteA,byteB){
    if(byteA===1&&byteB===1){
        return true;
    }else{
        return false;
    }
}

//반쪽덧셈(halfadder)
function halfadder(byteA,byteB){
    var answer = [];
    answer[0] = Number(carry(byteA,byteB));
    answer[1] = Number(sum(byteA,byteB));
    return answer;
}

console.log(halfadder(1,1));



//전체덧셈(fulladder)
function fulladder(byteA,byteB,carry){
   
   var answer = [];
   var sum = halfadder(halfadder(byteA,byteB)[1],carry)[1];//sum
   answer[1] = sum;

   if(halfadder(byteB,byteB)[0]===0&&
    halfadder(halfadder(byteA,byteB)[0],carry)[0]===0){
        answer[0] = Number(false);
    }else{ answer[0] = Number(true);}

   
   return answer;
}


console.log(fulladder(0,1,1));


//8비트 덧셈기
function byteadder(byteA,byteB){

    var answer = [];

    for(var a=0; a<9; a++){

        if(a===0){
            answer[a] = fulladder(byteA[a],byteB[a],0)[1];
        }else{
            answer[a] = fulladder(byteA[a],byteB[a],halfadder(byteA[a-1],byteB[a-1])[0])[1];
        }
    
    }

    return answer;
}


var byteA = [1,1,0,0,1,0,1,0];
var byteB = [1,1,0,1,1,0,0,1];

console.log(byteadder(byteA,byteB));


