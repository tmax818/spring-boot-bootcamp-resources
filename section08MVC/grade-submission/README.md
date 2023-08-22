# MVC

- allows build of scaleable apps

M: model the data the view needs
V: what the user sees visual element
C: glues the view and model together allows view and model to interact

|model|view|controller
|---|---|---|
|data|visual element|links the two
|||handles http requests

# the controller

- spring boot uses annotations to create magic

- annotations add logic:

`@Controller` - converts a class into a controller, class becomes the entry point for all web requests.

[GradeController.java](./src/main/java/com/ltp/gradesubmission/GradeController.java)

GET request - user is requesting a resource
  -   must specify
      -   host
      -   port
      -   path

controller uses the path do decide which method to run.

`@GetMapping(path)` - can respond to GET requests

## the view

handler method returns a view.
the view needs data => model

## the model

- a container that holds data

[Grade.java](./src/main/java/com/ltp/gradesubmission/Grade.java)


## Thymeleaf Expressions


variable expression `${...}`
selection expression `*{modelField} `

## forms

### form creation

- bind form to an object
- bind each form input to an object field

### form submission

