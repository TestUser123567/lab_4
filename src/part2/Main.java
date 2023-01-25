package part2;
public class Main {
    public static void main(String[] args)
    {
        Server server = new Server(10);
        for (int i = 0; i < server.getLimitVehicle(); i++)
        {
            Machine vehicle;
            int random = (int)(1 + Math.random() * 3);
            switch(random)
            {
                case 1: vehicle = new TractorWheeled("Tractor blue", 1000, 20, 0, "wheeled"); break;
                case 2: vehicle = new TractorCrawler("Tractor black", 3000, 40, 2, "crawler"); break;
                case 3: vehicle = new Bus("Bus green", 1500, 90, 27); break;
                default: vehicle = null; break;
            }
            server.addTransport(random, vehicle);
        }
    }
}