console.log("Just Checking");

let currentTheme=getTheme();

changeTheme();
//change theme
function changeTheme(){
    //set the class to html pages
    document.querySelector("html").classList.add(currentTheme);

    //setting listener to change the themes through button 
    const changeThemeButton= document.querySelector("#change_button");


    changeThemeButton.addEventListener("click", (event) => {

        const oldTheme= currentTheme;
        console.log("Theme color changed");

        //changing theme
        if(currentTheme === "dark"){
            currentTheme= "light";
        } else{
            currentTheme= "dark";
        }

        //updating on local storage
        setTheme(currentTheme);
        
        //remove current theme
        document.querySelector("html").classList.remove(oldTheme);

        //set current theme
        document.querySelector("html").classList.add(currentTheme);

        changeThemeButton.querySelector("span").textContent= currentTheme === "light" ? "Dark" : "Light" ;

    });
}

//set theme
function setTheme(theme){
    localStorage.setItem( "theme", theme);
}

// get theme
function getTheme(){
    let theme=localStorage.getItem("theme");
    return theme ? theme : "light";
}