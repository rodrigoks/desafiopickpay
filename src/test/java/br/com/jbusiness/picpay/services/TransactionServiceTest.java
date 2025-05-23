package br.com.jbusiness.picpay.services;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TransactionServiceTest {

    // @Mock
    // private UserService userService;

    // @Mock
    // private TransactionRepository repository;

    // @Mock
    // private AuthorizationService authService;

    // @Mock
    // private NotificationService notificationService;

    // @Autowired
    // @InjectMocks
    // private TransactionService transactionService;

    // @Test
    // @DisplayName("Should create transaction successfully when everything is OK")
    // void createTransactionCase1() throws Exception {
    //     User sender = new User(1L, "Maria", "Souza", "99999999901", "maria@gmail.com", "12345", new BigDecimal(10), UserType.COMMON);
    //     User receiver = new User(2L, "Joao", "Souza", "99999999902", "joao@gmail.com", "12345", new BigDecimal(10), UserType.COMMON);

    //     when(userService.findUserById(1L)).thenReturn(sender);
    //     when(userService.findUserById(2L)).thenReturn(receiver);

    //     when(authService.authorizeTransaction(any(), any())).thenReturn(true);

    //     TransactionDTO request = new TransactionDTO(new BigDecimal(10), 1L, 2L);
    //     transactionService.createTransaction(request);

    //     verify(repository, times(1)).save(any());

    //     sender.setBalance(new BigDecimal(0));
    //     verify(userService, times(1)).saveUser(sender);

    //     receiver.setBalance(new BigDecimal(20));
    //     verify(userService, times(1)).saveUser(receiver);

    //     verify(notificationService, times(1)).sendNotification(sender, "Transação realizada com sucesso");
    //     verify(notificationService, times(1)).sendNotification(receiver, "Transação recebida com sucesso");
    // }

    // @Test
    // @DisplayName("Should throw Exception when Transaction is not allowed")
    // void createTransactionCase2() throws Exception {
    //     User sender = new User(1L, "Maria", "Souza", "99999999901", "maria@gmail.com", "12345", new BigDecimal(10), UserType.COMMON);
    //     User receiver = new User(2L, "Joao", "Souza", "99999999902", "joao@gmail.com", "12345", new BigDecimal(10), UserType.COMMON);

    //     when(userService.findUserById(1L)).thenReturn(sender);
    //     when(userService.findUserById(2L)).thenReturn(receiver);

    //     when(authService.authorizeTransaction(any(), any())).thenReturn(false);

    //     Exception thrown = Assertions.assertThrows(Exception.class, () -> {
    //         TransactionDTO request = new TransactionDTO(new BigDecimal(10), 1L, 2L);
    //         transactionService.createTransaction(request);
    //     });

    //     Assertions.assertEquals("Transação não autorizada", thrown.getMessage());
    // }

}
