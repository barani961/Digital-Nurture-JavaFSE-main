// Exercise 1

console.log("Welcome to the Community Portal");

window.addEventListener("load", () => {
    alert("Page Loaded Successfully");
});

// Exercise 2

const eventName = "Music Festival";
const eventDate = "2026-06-15";
let seats = 50;

console.log(
`Event: ${eventName}
Date: ${eventDate}
Seats: ${seats}`
);

seats--;

// Exercise 5

class Event {

    constructor(name, category, seats, date) {
        this.name = name;
        this.category = category;
        this.seats = seats;
        this.date = date;
    }
}

Event.prototype.checkAvailability = function () {
    return this.seats > 0;
};

// Exercise 6

let events = [

    new Event(
        "Music Festival",
        "Music",
        10,
        "2026-06-15"
    ),

    new Event(
        "Baking Workshop",
        "Workshop",
        5,
        "2026-07-20"
    )
];

// push()

events.push(
    new Event(
        "Coding Workshop",
        "Workshop",
        15,
        "2026-08-01"
    )
);

// filter()

const musicEvents =
events.filter(
event => event.category === "Music"
);

console.log(musicEvents);

// map()

const eventTitles =
events.map(
event => `Workshop on ${event.name}`
);

console.log(eventTitles);

// Exercise 4

function addEvent(event){
    events.push(event);
}

function registerUser(eventName){
    console.log(
    `Registered for ${eventName}`
    );
}

function filterEventsByCategory(
category,
callback
){

    const filtered =
    events.filter(
    event =>
    event.category === category
    );

    callback(filtered);
}

// Closure

function registrationTracker(){

    let total = 0;

    return function(){

        total++;

        return total;
    };
}

const countRegistration =
registrationTracker();

// Exercise 7

const container =
document.querySelector(
"#eventContainer"
);

function displayEvents(){

    container.innerHTML = "";

    events.forEach(event => {

        if(event.seats > 0){

            const card =
            document.createElement("div");

            card.className = "card";

            card.innerHTML = `
            <h3>${event.name}</h3>

            <p>
            Category:
            ${event.category}
            </p>

            <p>
            Seats:
            ${event.seats}
            </p>

            <button onclick=
            "handleRegistration(
            '${event.name}'
            )">
            Register
            </button>
            `;

            container.appendChild(card);
        }
    });
}

displayEvents();

// Exercise 3 + 8

function handleRegistration(name){

    try{

        const event =
        events.find(
        e => e.name === name
        );

        if(event.seats <= 0){

            throw new Error(
            "No seats available"
            );
        }

        event.seats--;

        alert(
        `Registered for ${name}`
        );

        console.log(
        "Total Registrations:",
        countRegistration()
        );

        displayEvents();

    }catch(error){

        alert(error.message);
    }
}

document
.getElementById("categoryFilter")
.onchange = function(){

    const category = this.value;

    if(category === "All"){

        displayEvents();

        return;
    }

    filterEventsByCategory(

        category,

        result => {

            container.innerHTML = "";

            result.forEach(event => {

                const card =
                document.createElement("div");

                card.className =
                "card";

                card.innerHTML =
                `<h3>${event.name}</h3>`;

                container.appendChild(card);
            });
        }
    );
};

document
.getElementById("searchBox")
.addEventListener(

"keydown",

function(event){

    console.log(
    "Searching:",
    event.target.value
    );
});

// Exercise 9

function fetchEvents(){

    document
    .getElementById("spinner")
    .style.display = "block";

    fetch("events.json")

    .then(response =>
    response.json())

    .then(data => {

        console.log(
        "Fetched Events:",
        data
        );

        document
        .getElementById("spinner")
        .style.display =
        "none";
    })

    .catch(error => {

        console.log(error);
    });
}

fetchEvents();

async function fetchEventsAsync(){

    try{

        const response =
        await fetch(
        "events.json"
        );

        const data =
        await response.json();

        console.log(data);

    }catch(error){

        console.log(error);
    }
}

// Exercise 10

const copiedEvents = [...events];

const {
    name,
    category
} = events[0];

console.log(
name,
category
);

// Exercise 11

document
.getElementById("registerForm")

.addEventListener(

"submit",

function(event){

    event.preventDefault();

    const form =
    event.target;

    const name =
    form.elements["name"]
    .value;

    const email =
    form.elements["email"]
    .value;

    const selectedEvent =
    form.elements["event"]
    .value;

    if(
        name === "" ||
        email === ""
    ){

        document
        .getElementById(
        "formError"
        )
        .innerText =
        "Please fill all fields";

        return;
    }

    document
    .getElementById(
    "formError"
    )
    .innerText = "";

    console.log(
        name,
        email,
        selectedEvent
    );

    submitRegistration();
});

// Exercise 12

function submitRegistration(){

    const user = {

        name:"John",

        email:
        "john@test.com"
    };

    setTimeout(() => {

        fetch(
        "https://jsonplaceholder.typicode.com/posts",

        {
            method:"POST",

            headers:{
                "Content-Type":
                "application/json"
            },

            body:
            JSON.stringify(user)
        })

        .then(response =>
        response.json())

        .then(data => {

            alert(
            "Registration Successful"
            );

            console.log(data);
        })

        .catch(error => {

            alert(
            "Registration Failed"
            );

            console.log(error);
        });

    },2000);
}

// Exercise 13

console.log(
"Debug Step 1"
);

console.log(
"Debug Step 2"
);

console.log(
"Debug Step 3"
);

// Exercise 14

$("#registerBtn").click(function(){

    console.log(
    "jQuery Click Event"
    );
});

$(".card").fadeIn();

setTimeout(() => {

    $(".card").fadeOut();

},5000);

console.log(
"React and Vue provide component-based architecture and better state management."
);