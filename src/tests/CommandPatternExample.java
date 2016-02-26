package tests;

/**
 * Created by user on 26.02.2016.
 */
public class CommandPatternExample
{
    public static void main(String[] args)
    {
        Executor executor = new Executor();
        executor.execute(new Command()
        {
            @Override
            public void execute(int parameter)
            {
                System.out.println(parameter + parameter);
            }
        });
    }
}

class Executor
{
    private int parameter = 100;
    public void execute(Command command)
    {
        if (command != null) {
            command.execute(parameter);
        }
    }
}

interface Command
{
    public void execute(int parameter);
}
