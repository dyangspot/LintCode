function sortScores(unorderedScores, highestScore){
	var length = highestScore+1;
  	var scoreCounts = new Array(length);
  	while(length--){
  		scoreCounts[length] = 0;
  	}

    for(i=0;i<unorderedScores.length;i++){
        var index = unorderedScores[i];
        scoreCounts[index] = scoreCounts[index] + 1;
    }

     for(j=scoreCounts.length; j>=0; j--){
 	if(scoreCounts[j] > 0){
 		if(scoreCounts[j] > 1){
 			var count = scoreCounts[j];
 			while(count--){
 				console.log(j);
 			}
 		}else{
 			console.log(j);
 		}

 	}
 	
 }
    
    
}

