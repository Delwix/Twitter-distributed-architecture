function retweet() {

    const request = {
        "userId" : "1",
        "text" : "Sample text",
        "tweetId" : "6"
    }

    console.log(typeof JSON.stringify(request));

    const retweetPostRequest = async () => {
        const response = await fetch('http://localhost:9001/tweetpost/retweet', {
          method: 'POST',
          body: JSON.stringify(request),
          headers: {
            'Content-Type': 'application/json'
          }
        });
        const myJson = await response.json();
        console.log(myJson);
        console.log("request succesful !");

        document.getElementById("post").innerHTML += 
              JSON.stringify(myJson)
      }

      retweetPostRequest()
}

function publish() {

    const request = {
        "userId" : "1",
        "text" : "Sample text",
        "media" : "IT-006"
    }

    console.log(typeof JSON.stringify(request));

    const publishPostRequest = async () => {
        const response = await fetch('http://localhost:9001/tweetpost/publish', {
          method: 'POST',
          body: JSON.stringify(request),
          headers: {
            'Content-Type': 'application/json'
          }
        });
        const myJson = await response.json();
        console.log(myJson);
        console.log("request succesful !");

        document.getElementById("post").innerHTML += 
              JSON.stringify(myJson)
      }

      publishPostRequest()
    
}

function comment() {

    const request = {
        "userId" : "1",
        "text" : "Sample text",
        "tweetId" : "6",
        "media" : "Sample media"
    }

    const commentPostRequest = async () => {
        const response = await fetch('http://localhost:9001/tweetpost/comment', {
          method: 'POST',
          body: JSON.stringify(request),
          headers: {
            'Content-Type': 'application/json'
          }
        });
        const myJson = await response.json();
        console.log(myJson);
        console.log("request succesful !");

        document.getElementById("post").innerHTML += 
              JSON.stringify(myJson)
      }

      commentPostRequest()
}

function react() {

    const request = {
        "userId" : "1",
        "tweetId" : "5"
    }

    const reactToTweetRequest = async () => {
        const response = await fetch('http://localhost:9005/preferences/react', {
          method: 'POST',
          body: JSON.stringify(request),
          headers: {
            'Content-Type': 'application/json'
          }
        });
        const myJson = await response.json();
        console.log(myJson);
        console.log("request succesful !");

        document.getElementById("post").innerHTML += 
              JSON.stringify(myJson)
      }

      reactToTweetRequest()
}