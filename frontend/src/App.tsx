import React, { useState, useEffect } from 'react';
import "./colored-dots.css"

function App() {

    const [greeting, setGreeting] = useState('')
    const [greetingError, setGreetingError] = useState('')

    const [colorList, setColorList] = useState([] as string[])
    const [errorMessage, setErrorMessage] = useState('')

    useEffect(() => {
        fetch(`${process.env.REACT_APP_BASE_URL}/api/greeting`, {
            method: 'GET',
            headers: {
                'Accept': 'text/plain'
            }
        })
            .then(response => response.text())
            .then(text => setGreeting(text))
            .catch(err => setGreetingError('Da ist etwas schief gelaufen'));
    }, []);

    useEffect(() => {
        fetch(`${process.env.REACT_APP_BASE_URL}/dots`, {
            method: 'GET'
        })
            .then(response => response.json())
            .then((listOfColors: Array <string>) => setColorList(listOfColors))
            .catch(err => setErrorMessage('No color received'));
    }, []);


    return (
        <div>
            <div>
                {greeting}
            </div>
            <div>
                {greetingError && <div>{greetingError}</div> }
                {errorMessage && <div>{errorMessage}</div> }
            </div>
            <div>
                {colorList.map(item => <span className={"dot"} style={{color: item}} key={item}> • </span>)}
            </div>
        </div>
    );
}

export default App;
