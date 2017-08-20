package empiresage;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Lydia
 */
public class EmpiresAge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap <String,Integer> state = new HashMap <String,Integer>();
        state.put("numberOfVillagersPlayerOne", 1);
        state.put("numberOfVillagersPlayerTwo", 2);
        state.put("numberOfFightersPlayerOne", 2);
        state.put("numberOfFightersPlayerTwo", 2);
        state.put("numberOfHousesPlayerOne", 1);
        state.put("numberOfHousesPlayerTwo", 1);
        state.put("numberOfFightingUnitOne", 1);
        state.put("numberOfFightingUnitTwo", 1);
        state.put("woodPlayerOne", 0);
        state.put("woodPlayerTwo", 0);
        state.put("foodPlayerOne", 0);
        state.put("foodPlayerTwo", 0);

        
        // MiniMax VS MCTS
        MinMaxPlayer minMax = new MinMaxPlayer(state,1);       
        MCTSPlayer mscts = new MCTSPlayer(state,2);
        while (!mscts.endGame(state) && !minMax.endGame(state)){
           state= mscts.updateMove(state);
           mscts.setState(state);
           minMax.setState(state);
           state = minMax.updateMove(state);
           mscts.setState(state);
           minMax.setState(state);
        }
        
        if(minMax.endGame(state)){
            System.out.println("And the winnerrrrrrrrr of the battle between Minimax and MCTS isssssss MiniMax");
        }
        if(mscts.endGame(state)){
            System.out.println("And the winnerrrrrrrrr of the battle between Minimax and MCTS isssssss MCTS");
        }

        // MCTS VS Monte Carlo
        HashMap <String,Integer> state2 = new HashMap <String,Integer>();
        state2.put("numberOfVillagersPlayerOne", 1);
        state2.put("numberOfVillagersPlayerTwo", 2);
        state2.put("numberOfFightersPlayerOne", 2);
        state2.put("numberOfFightersPlayerTwo", 2);
        state2.put("numberOfHousesPlayerOne", 1);
        state2.put("numberOfHousesPlayerTwo", 1);
        state2.put("numberOfFightingUnitOne", 1);
        state2.put("numberOfFightingUnitTwo", 1);
        state2.put("woodPlayerOne", 0);
        state2.put("woodPlayerTwo", 0);
        state2.put("foodPlayerOne", 0);
        state2.put("foodPlayerTwo", 0);

        MonteCarlo mc = new MonteCarlo(state2,1);
        MCTSPlayer mscts2 = new MCTSPlayer(state2,2);
        while (!mscts2.endGame(state2) && !minMax.endGame(state2)){
           state2= mscts2.updateMove(state2);
           mscts2.setState(state2);
           mc.setState(state2);
           state2 = mc.updateMove(state2);
           mscts2.setState(state2);
           mc.setState(state2);
        }
        
        if(mc.endGame(state2)){
            System.out.println("And the winnerrrrrrrrr of the battle between MCTS and Monte Carlo isssssss Monte Carlo");
        }
        if(mscts2.endGame(state2)){
            System.out.println("And the winnerrrrrrrrr of the battle between MCTS and MonteCarlo isssssss MCTS");
        }

        
         // Minimax VS Monte Carlo
        HashMap <String,Integer> state3 = new HashMap <String,Integer>();
        state3.put("numberOfVillagersPlayerOne", 1);
        state3.put("numberOfVillagersPlayerTwo", 2);
        state3.put("numberOfFightersPlayerOne", 2);
        state3.put("numberOfFightersPlayerTwo", 2);
        state3.put("numberOfHousesPlayerOne", 1);
        state3.put("numberOfHousesPlayerTwo", 1);
        state3.put("numberOfFightingUnitOne", 1);
        state3.put("numberOfFightingUnitTwo", 1);
        state3.put("woodPlayerOne", 0);
        state3.put("woodPlayerTwo", 0);
        state3.put("foodPlayerOne", 0);
        state3.put("foodPlayerTwo", 0);

        MonteCarlo mc2 = new MonteCarlo(state3,2);
        MinMaxPlayer minMax2 = new MinMaxPlayer(state3,1);       
        while (!minMax2.endGame(state3) && !mc2.endGame(state3)){
           state3= minMax2.updateMove(state3);
           minMax2.setState(state3);
           mc2.setState(state3);
           state3 = mc2.updateMove(state3);
           minMax2.setState(state3);
           mc2.setState(state3);
        }
        
        if(mc2.endGame(state3)){
            System.out.println("And the winnerrrrrrrrr of the battle between Minimax and Monte Carlo isssssss Monte Carlo");
        }
        if(minMax2.endGame(state3)){
            System.out.println("And the winnerrrrrrrrr of the battle between Minimax and Monte Carlo isssssss MiniMAx");
        }
    }
    
}
