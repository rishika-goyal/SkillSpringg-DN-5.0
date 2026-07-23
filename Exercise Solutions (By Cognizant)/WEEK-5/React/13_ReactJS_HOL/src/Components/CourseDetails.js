function CourseDetails() {

    const courses = [
        {
            id: 1,
            name: "React JS",
            duration: "45 Days",
            active: true
        },
        {
            id: 2,
            name: "Spring Boot",
            duration: "60 Days",
            active: false
        },
        {
            id: 3,
            name: "Angular",
            duration: "40 Days",
            active: true
        }
    ];

    return (

        <div className="section">

            <h2>🎓 Course Details</h2>

            <div className="cards">

                {courses.map(course => (

                    <div className="card" key={course.id}>

                        <h3>{course.name}</h3>

                        <p>

                            <strong>Duration:</strong>

                            {course.duration}

                        </p>

                        <p>

                            <strong>Status:</strong>

                            {

                                course.active

                                    ?

                                    <span className="green">

                                        Available

                                    </span>

                                    :

                                    <span className="red">

                                        Closed

                                    </span>

                            }

                        </p>

                    </div>

                ))}

            </div>

        </div>

    );

}

export default CourseDetails;