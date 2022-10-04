class Employee{
    name1:string;
    empid:number;
    constructor(name1:string,empid:number){
        this.name1=name1;
        this.empid=empid;

    }
    display(){
        console.log("Name:", this.name1);
        console.log("Empid:",this.empid);
    }
}
var obj2=new Array(new Employee("Naga",2),new Employee("insaf",3),new Employee("sai",4),new Employee("Rissi",5));
for(var i=0;i<obj2.length;i++){
    console.log("Details of Employee No:",i+1);
    obj2[i].display();
}

