using StudentApp.Models;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;

namespace StudentApp.Controllers
{
    public class StudentsController : ApiController
    {
        Student[] students = new Student[] {
            new Student { Id = 1, Name = "Saman Kumara", School="Royal College", GuardianName="Sampath Kumara"},
            new Student { Id = 2, Name = "John Doe", School="Kimgswood", GuardianName="James Doe"},
            new Student { Id = 3, Name = "Angie Lee", School="Havard", GuardianName="Sunil Perera"},
        };

        [HttpGet]
        public IEnumerable<Student> GetAllStudents()
        {
            return students;
        }

        [HttpGet]
        public IHttpActionResult GetStudent(int id)
        {
            var student = students.FirstOrDefault((s) => s.Id == id);
            if (student == null)
            {
                return NotFound();
            }
            return Ok(student);
        }

        [HttpPost]
        public void myPostmethod()
        {
            Debug.WriteLine("My Post Method is called");
        }
    }
}
