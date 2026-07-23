import { useState } from "react";
import "./App.css";

import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";

function App() {

    const [showBlogs, setShowBlogs] = useState(true);

    return (

        <div>

            <div className="header">

                <h1>Blogger Dashboard</h1>

            </div>

            <BookDetails />

            <div className="center">

                <button
                    onClick={() => setShowBlogs(!showBlogs)}
                >

                    {

                        showBlogs

                            ?

                            "Hide Blogs"

                            :

                            "Show Blogs"

                    }

                </button>

            </div>

            {

                showBlogs

                    &&

                <BlogDetails />

            }

            <CourseDetails />

        </div>

    );

}

export default App;