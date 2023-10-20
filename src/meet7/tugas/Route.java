package meet7.tugas;

public abstract class Route {
    private Location start;
    private Location end;
    private Routable usedRoute;

    protected Route(Location start, Location end) {
        this.start = start;
        this.end = end;
    }

    public void setUsedRoute(Routable usedRoute) {
        this.usedRoute = usedRoute;
    }

    public void printRoute(){
        usedRoute.findBestRoute(start, end);
    }
}

class Walking extends Route{
    public Walking(Location start, Location end) {
        super(start, end);
        super.setUsedRoute(new WalkingRoute());
    }
}


class Driving extends Route {
    public Driving(Location start, Location end) {
        super(start, end);
        super.setUsedRoute(new CarRoute());
    }
}



class Riding extends Route{
    public Riding(Location start, Location end) {
        super(start, end);
        super.setUsedRoute(new MotorcycleRoute());
    }
}

