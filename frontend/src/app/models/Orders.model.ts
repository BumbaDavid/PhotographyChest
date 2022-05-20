import {PhotoModel} from "./Photo.model";

export interface OrdersModel{
  id?: number,
  portofolioId? : PhotoModel,
  status?: string,
  reason?: string
}
