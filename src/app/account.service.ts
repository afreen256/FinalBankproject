import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { from, Observable } from 'rxjs';
import { AccountDetails } from './accountdetails';
import { Deposit } from './deposit';
import { Transfer } from './transfer';
import { Withdraw } from './withdraw';

@Injectable({
  providedIn: 'root'
})
export class AccountService {
  private baseURL="http://localhost:8089/bankapp/accounts";

  constructor(private httpClient: HttpClient) { }
  
//return this.httpClient.get<Employee[]>(`${this.baseURL}`);

  getAccountList(): Observable<AccountDetails[]>{
    return this.httpClient.get<AccountDetails[]>(`${this.baseURL}`);
  }

  createAccount(account: AccountDetails): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, account);
  }

  
  updateEmployee(accountId: number, account: AccountDetails): Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/${accountId}`, account);
  }
  getAccountById(accountId: number): Observable<AccountDetails>{
    return this.httpClient.get<AccountDetails>(`${this.baseURL}/${accountId}`);
  }
  deleteAccount(accountId: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${accountId}`);
  }

   depositAmount(deposit: Deposit): Observable<Object>{
     return this.httpClient.put(`${this.baseURL}`,deposit);
   }
 withdrawAmount(withdraw: Withdraw): Observable<Object>{
  return this.httpClient.put(`${this.baseURL}`,withdraw);
 }
 transferAmount(transfers: Transfer): Observable<Object>{
  return this.httpClient.put(`${this.baseURL}`,transfers);
 }

}
