import javax.swing.JOptionPane;

public class calculator 
{
    public static void main(String[] args) throws Exception 
    {
    int num1, num2, result, question;
    String operacao;

    do{
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro número: "));
        operacao = JOptionPane.showInputDialog(null, "Determine a operação desejada: (+, -, * ou /)");
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo número: "));

        if(operacao.equalsIgnoreCase("+"))
        {
            result=num1+num2;
            JOptionPane.showMessageDialog(null, "O resultado é: " + result);
        }
        else if (operacao.equalsIgnoreCase("-"))
        {
            result=num1-num2;
            JOptionPane.showMessageDialog(null, "O resultado é: " + result);
        }
        else if (operacao.equalsIgnoreCase("*"))
        {
            result=num1*num2;
            JOptionPane.showMessageDialog(null, "O resultado é: " + result);
        }
        else
        {
            result=num1/num2;
            JOptionPane.showMessageDialog(null, "O resultado é: " + result);
        }

        question = JOptionPane.showConfirmDialog(null, "Deseja realizar uma nova operação?", "Sair", JOptionPane.YES_NO_OPTION); 
        
    if (question==JOptionPane.NO_OPTION)
    {
        JOptionPane.showMessageDialog(null, "Obrigado por utilizar este serviço", "OBRIGADO", JOptionPane.INFORMATION_MESSAGE);
    }
     }while(question==JOptionPane.YES_OPTION);
     
    }
}
