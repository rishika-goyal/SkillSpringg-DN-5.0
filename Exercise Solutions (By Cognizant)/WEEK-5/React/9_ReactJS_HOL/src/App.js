import ListofPlayers from "./Components/ListofPlayers";
import IndianPlayers from "./Components/IndianPlayers";

function App() {

    const flag = true;

    if (flag) {

        return <ListofPlayers />;

    }

    else {

        return <IndianPlayers />;

    }

}

export default App;