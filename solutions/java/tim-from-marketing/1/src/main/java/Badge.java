class Badge {
    public String print(Integer id, String name, String department) {
        String a = "";
        if(id!=null) a = "["+id+"] - ";
        String b = name;
        String c = " - ";
        if(department!=null) c+=department.toUpperCase();
        else c+="OWNER";
        return a+b+c;
    }
}
