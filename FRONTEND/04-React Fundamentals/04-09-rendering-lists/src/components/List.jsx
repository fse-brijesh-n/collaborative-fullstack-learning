import React from 'react'

const List = () => {
 const students = [
{id:1,name:"khushi",course:"mca"},
{id:2,name:"komal",course:"ma"},
{id:3,name:"nikhil",course:"12th"},
{id:4,name:"alice",course:"mba"}
  ];
    return (
    <div>
      {students.map((student)=>{
        return (
          <div key={student.id}>
            <h1>{student.name}</h1>
            <p>{student.course}</p>
          </div>
        )
      })}
    </div>
  )
}

export default List
