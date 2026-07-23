function BlogDetails() {

    const blogs = [
        {
            id: 1,
            title: "Understanding React",
            author: "Saranya",
            likes: 120
        },
        {
            id: 2,
            title: "Java Interview Tips",
            author: "CTS Mentor",
            likes: 95
        }
    ];

    return (

        <div className="section">

            <h2>📝 Blog Details</h2>

            <div className="cards">

                {blogs.map(blog => (

                    <div className="card" key={blog.id}>

                        <h3>{blog.title}</h3>

                        <p><strong>Author:</strong> {blog.author}</p>

                        <p><strong>Likes:</strong> ❤️ {blog.likes}</p>

                    </div>

                ))}

            </div>

        </div>

    );

}

export default BlogDetails;