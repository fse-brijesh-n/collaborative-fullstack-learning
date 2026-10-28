import { useState } from "react";
import "./App.css";
import ControlledForm from "./components/ControlledForm";
import UncontrolledForm from "./components/UncontrolledForm";
import InputField from "./components/InputField";     
import TextareaField from "./components/TextareaField";
import SelectField from "./components/SelectField";
import CheckboxField from "./components/CheckboxField";
import RadioField from "./components/RadioField";
import FormValidation from "./components/FormValidation";
function App() {
  const [count, setCount] = useState(0);

  return (
    <>
    <p>Welcome to the Controlled Form App</p>
    <ControlledForm name="khushi" />
    <hr />
    <UncontrolledForm />
    <hr />
    <InputField />
    <hr />
    <TextareaField/>
    <hr />
    <SelectField/>
    <hr />
    <CheckboxField/>
    <hr />
    <RadioField/>
    <hr />  
    <FormValidation/>

     

    </>
  );
}

export default App;
