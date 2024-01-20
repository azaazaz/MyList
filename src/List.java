public class List {
    //String first;
    //int length;
    
    //void print_out(){
    //    System.out.print(length);}

    String array = "";
    private int length;

    
    void append(int element){
        String sep = "";
        if (this.length != 0){
            sep = ",";
        }
        this.array = this.array + sep + element;
        // Element el = new Element();
        // el.data = element;
        this.length ++;
        // el.index = length-1;
    }

    void append_begin(int element){
        this.array = element + "," + this.array;
        this.length ++;
    }

    String get(int index){
        int counter = 0;
        String element = "";

        if (index < 0){
            index += this.length -1;
        }

        if (index > this.length - 1){
            return "";
        }


        for (int i = 0; i < this.array.length(); i++) {
            char c = this.array.charAt(i); 
            if (c == ','){
                if (counter == index){
                    return (element);
                }
                element = "";
                counter ++;
            }
            else{
                element = element + c;
            }

        }
        // for last element
        return element;
    }

    String pop(){
        String element;
        element = this.get(this.length-1);
        // element = 36;
        // -1 for index -1 for ","
        this.array = this.array.substring(0,(this.array.length()-1-((element).length())));
        return(element);
    }

    void remove_first(){
        String element = this.get(0);
        // int element = 427;
        this.array = this.array.substring(((element).length())+1,this.array.length());
        this.length --;
    }

    void set(int el, int index){
        if (index == 0){
            this.append_begin(el);
        }
        else if (index == this.length - 1){
            this.append(el);
        }
        else{
            int counter = 0;
            for (int i = 0; i < this.array.length(); i++) {
                char c = this.array.charAt(i); 
                if (c == ','){
                    counter +=1;
                    if (counter == index){
                        this.array = this.array.substring(0,i) + "," + el + "," + this.array.substring(i+1, this.array.length());
                        break;
                    }
                }
            }
        }
    }
}