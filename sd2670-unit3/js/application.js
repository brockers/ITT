var config1 = {
  "id": '616382756025532416',
  "domId": 'mytweets',
  "maxTweets": 3,
  "enableLinks": true
};

$( document ).ready(function(){
	twitterFetcher.fetch(config1);
});
