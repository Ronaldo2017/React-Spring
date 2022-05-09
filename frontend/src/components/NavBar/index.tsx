import {ReactComponent as GithubIcon} from 'assets/img/git.svg';
import './styles.css';

function NavBar(){
    return(

        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>DSMovie</h1>
                    <a href="https://github.com/Ronaldo2017/React-Spring" target="_blank" rel="noreferrer">
                        <div className="dsmovie-contact-container">
                            <GithubIcon />
                            <p className="dsmovie-contact-link">/Ronaldo</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );
}

export default NavBar;