import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';
import './App.css';

function App() {
  const [activeComponent, setActiveComponent] = useState("book");
  const showCourse = true; // for && condition

  // 1. Using switch-case with function
  const renderComponentSwitch = () => {
    switch (activeComponent) {
      case "book":
        return <BookDetails />;
      case "blog":
        return <BlogDetails />;
      case "course":
        return <CourseDetails />;
      default:
        return <h3>No Component Selected</h3>;
    }
  };

  return (
    <div className="App">
      <h1>📘 Blogger App</h1>
      <div>
        <button onClick={() => setActiveComponent("book")}>Show Book</button>
        <button onClick={() => setActiveComponent("blog")}>Show Blog</button>
        <button onClick={() => setActiveComponent("course")}>Show Course</button>
      </div>

      <hr />

      {/* 1. Switch-Case Rendering */}
      <h2>Using Switch-Case</h2>
      {renderComponentSwitch()}

      <hr />

      {/* 2. If-Else rendering */}
      <h2>Using If-Else</h2>
      {(() => {
        if (activeComponent === "book") return <BookDetails />;
        else if (activeComponent === "blog") return <BlogDetails />;
        else if (activeComponent === "course") return <CourseDetails />;
        else return null;
      })()}

      <hr />

      {/* 3. Ternary Operator rendering */}
      <h2>Using Ternary Operator</h2>
      {
        activeComponent === "book"
          ? <BookDetails />
          : activeComponent === "blog"
          ? <BlogDetails />
          : activeComponent === "course"
          ? <CourseDetails />
          : <p>Select a component</p>
      }

      <hr />

      {/* 4. Logical && rendering */}
      <h2>Using && Logical Operator</h2>
      {showCourse && <CourseDetails />}
    </div>
  );
}

export default App;
