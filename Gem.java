/*
* GemApp.java
* @author: Ata Turkoglu
* Date: 07/03/2023
*/

public class Gem{
    private String birMon;
    private String birSton;

    public Gem(){
        birMon = "";
        birSton = "";
    }

    public void setBirMon(String birMon){
        this.birMon=birMon;
    }

    public void compute(){
        switch(birMon){
            case "Jan":
                birSton="garnet";
                break;
            case "Feb":
                birSton="amethyst";
                break;
            case "Mar":
                birSton="aquamarine";
                break;
            case "Apr":
                birSton="diamond";
                break;
            case "May":
                birSton="emerald";
                break;
            case "Jun":
                birSton="pearl";
                break;
            case "Jul":
                birSton="ruby";
                break;
            case "Aug":
            	birSton="peridot";
        		break;
       		case "Sep":
            	birSton="sapphire";
    			break;
           	case "Oct":
                birSton="opal";
    			break;
            case "Nov":
                birSton="topaz";
                break;
            case "Dec":
                birSton="turquoise";
                break;
            default:
            	birSton="";
            	break;
        }
    }

        public String getBirSton(){
            return birSton;
            }
}