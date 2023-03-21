class Darts {
    int score(double xOfDart, double yOfDart) {
        int score = 0;
        double distancia = Math.sqrt(Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2));

        if(distancia >= 0 && distancia <=1)
            score = 10;
        else if(distancia > 1 && distancia <=5)
            score = 5;
        else if(distancia > 5 && distancia <=10)
            score = 1;
        

        return score;
    }
}
