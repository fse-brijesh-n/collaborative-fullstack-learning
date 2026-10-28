const express = require('express');
const { loginUser, registerUser ,getUsers} = require('../userController');
const routes = express.Router();
const {userRegisterValidate, userLoginValidate} =require('../utils/userValidation');
const { ensureAuthenticated } = require('../utils/auth');

routes.post('/register',userRegisterValidate,registerUser);

routes.post('/login',userLoginValidate,loginUser);
routes.get('/users',ensureAuthenticated,getUsers);
module.exports=routes;