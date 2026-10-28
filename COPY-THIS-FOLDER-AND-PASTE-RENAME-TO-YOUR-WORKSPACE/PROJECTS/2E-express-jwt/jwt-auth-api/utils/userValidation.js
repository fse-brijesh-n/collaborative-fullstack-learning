const Joi=require('joi');

const userRegisterValidate=(req,res,next)=>{
    const schema=Joi.object({
        fullName:Joi.string().min(3).max(100).required(),
        email:Joi.string().min(6).max(100).required().email(),
        password:Joi.string().min(8).max(16).alphanum().required(),   
    });
    const {error,value}=schema.validate(req.body);
    if(error){
        return res.status(400).json({message:"Bad reques",error});
    }
    next();
}

const userLoginValidate=(req,res,next)=>{
    const schema=Joi.object({
        email:Joi.string().min(6).max(100).required().email(),
        password:Joi.string().min(8).max(16).alphanum().required()
});

const {error,value} =schema.validate(req.body);
if(error){
    return res.status(400).json({message:"Bad reques",error});
}
next();

}


module.exports={
    userRegisterValidate,
    userLoginValidate
}