public class Vectors {
    public String isAtEquilibrium(int[][] actingForces) {
        //initializing sum of all forces to zero
        int XForces = 0;
        int YForces = 0;
        int ZForces = 0;
        //Each force is a column of the 2D array
        for (int i = 0; i < actingForces.length; i++) {
            XForces += actingForces[i][0];
            YForces += actingForces[i][1];
            ZForces += actingForces[i][2];
        }
        //Body is at equilibrium when sum of forces acting on it is ZERO
        if (XForces == 0 && YForces == 0 && ZForces == 0)
            return "Yes";
        else
            return "No";
    }
}
