import React from "react";
import "./index.css"

function NavBar() {
    return(
        <header>
        <nav className="container">
            <div className="nav-content">
                <h1>Movie Display</h1>
                <a href="https://github.com/devsuperior" target="_blank" rel="noreferrer">
                    <div className="contact-container">
                        <img src="https://avatars.githubusercontent.com/u/49655819?v=4" className="img-fluid" alt="pfp" style={{
                            height: "50px",
                            width: "50px",
                            borderRadius: "100%"
                        }}/>
                        <p className="contact-link fw-bold">/Jdavid77</p>
                    </div>
                </a>
            </div>
        </nav>
    </header>
    )
}

export default NavBar;