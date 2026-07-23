function BookDetails() {

    const books = [
        {
            id: 1,
            title: "React in Action",
            author: "Mark Tielens Thomas",
            price: 550
        },
        {
            id: 2,
            title: "Learning Java",
            author: "Patrick Niemeyer",
            price: 720
        },
        {
            id: 3,
            title: "Spring Boot Guide",
            author: "Craig Walls",
            price: 680
        }
    ];

    return (

        <div className="section">

            <h2>📚 Book Details</h2>

            <div className="cards">

                {books.map(book => (

                    <div className="card" key={book.id}>

                        <h3>{book.title}</h3>

                        <p><strong>Author:</strong> {book.author}</p>

                        <p>

                            <strong>Price:</strong>

                            <span className="green">

                                ₹ {book.price}

                            </span>

                        </p>

                    </div>

                ))}

            </div>

        </div>

    );

}

export default BookDetails;